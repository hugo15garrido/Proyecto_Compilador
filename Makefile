make: Compiler.class lib\ErrorHandler.class scanner\DecafLexer.java scanner\DecafLexer.class scanner\Scanner.class parser\CC4Parser.class parser\CC4Parser.class ast\Ast.class semantic\Semantic.class irt\Irt.class codegen\Codegen.class opt\Algebraic.class opt\ConstantFolding.class lib\Debug.class

lib\Debug.class: lib\Debug.java
	javac lib\Debug.java

lib\ErrorHandler.class: lib\ErrorHandler.java
	javac lib\ErrorHandler.java
	
opt\ConstantFolding.class: opt\ConstantFolding.java
	javac opt\ConstantFolding.java
	
opt\Algebraic.class: opt\Algebraic.java
	javac opt\Algebraic.java
	
codegen\Codegen.class: codegen\Codegen.java
	javac codegen\Codegen.java
	
irt\Irt.class: irt\Irt.java
	javac irt\Irt.java

semantic\Semantic.class: semantic\Semantic.java
	javac semantic\Semantic.java

ast\Ast.class: ast\Ast.java
	javac ast\Ast.java
	
parser\CC4Parser.class: parser\CC4Parser.java
	javac parser\CC4Parser.java

scanner\DecafLexer.java: scanner\Decaf.g
	java org.antlr.v4.Tool scanner\Decaf.g

scanner\DecafLexer.class: scanner\DecafLexer.java
	javac scanner\Decaf.java

scanner\Scanner.class: scanner\Scanner.java
	javac scanner\Scanner.java
	
Compiler.class: Compiler.java
	javac Compiler.java

clean:
	del lib\Debug.class
	del lib\ErrorHandler.class 
	del opt\ConstantFolding.class
	del opt\Algebraic.class
	del codegen\Codegen.class
	del irt\Irt.class
	del semantic\Semantic.class
	del ast\Ast.class
	del parser\CC4Parser.class
	del scanner\Scanner.class
	del Compiler.class
	

