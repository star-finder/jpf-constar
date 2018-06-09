package costar.bytecode;

import java.util.Map;
import java.util.Stack;

import costar.CoStarMethodExplorer;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;

public class FRETURN extends gov.nasa.jpf.jvm.bytecode.FRETURN {
	
	@Override
	public Instruction execute(ThreadInfo ti) {
		CoStarMethodExplorer analysis = CoStarMethodExplorer.getCurrentAnalysis(ti);
		
		if (analysis == null)
			return super.execute(ti);
		
		Stack<Map<Integer,Integer>> indexMap = analysis.getNameMap();
		indexMap.pop();
		
		return super.execute(ti);
	}

}
