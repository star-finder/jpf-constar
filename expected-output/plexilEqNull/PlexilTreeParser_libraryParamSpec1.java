package plexilEqNull;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import plexil.PlexilTreeParser;

public class PlexilTreeParser_libraryParamSpec1 extends TestJPF {

	@Test
	public void test_libraryParamSpec1() throws Exception {
		PlexilTreeParser obj = new PlexilTreeParser();
		obj.ASTNULL = new antlr.ASTNULLType();
		antlr.collections.AST _t = obj.ASTNULL;
		obj.libraryParamSpec(_t);
	}

}

