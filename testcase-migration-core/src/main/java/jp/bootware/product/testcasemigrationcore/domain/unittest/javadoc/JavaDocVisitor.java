package jp.bootware.product.testcasemigrationcore.domain.unittest.javadoc;

import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class JavaDocVisitor extends VoidVisitorAdapter<JavaDocStoreUnit> {

  public void visit(final JavadocComment n, final JavaDocStoreUnit arg) {
    String content = n.getContent();
    arg.addCase(content);
    n.getComment().ifPresent((l) -> {
      l.accept(this, arg);
    });
  }
}

