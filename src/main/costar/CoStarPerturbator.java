package costar;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.perturb.OperandPerturbator;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;

public class CoStarPerturbator implements OperandPerturbator {

	private final CoStarExplorer explorer;
	
	private Config config;
	
	private boolean isFirst = false;

	public CoStarPerturbator(Config config) {
		this.explorer = CoStar.getCoStarExplorer(config);
		this.config = config;
	}

	@Override
	public Class<? extends ChoiceGenerator<?>> getChoiceGeneratorType() {
		return CoStarChoiceGenerator.class;
	}

	@Override
	public ChoiceGenerator<?> createChoiceGenerator(String id, StackFrame sf, Object refObject) {
		if (!isFirst) {
			int size = 0;
			
			if (config.get("costar.bitmap_size") != null)
				size = Integer.parseInt(config.get("costar.bitmap_size").toString());
			explorer.newAnalysis(id, sf, (MethodInfo) refObject, size);
			
			isFirst = true;
	
			return new CoStarChoiceGenerator(id, explorer);
		} else {
			return null;
		}
	}

	@Override
	public boolean perturb(ChoiceGenerator<?> cg, StackFrame sf) {
		sf.getClassInfo();
		
		if (explorer.hasMoreChoices()) {
			explorer.newPath(sf);
			return true;
		}

		return false;
	}

}
