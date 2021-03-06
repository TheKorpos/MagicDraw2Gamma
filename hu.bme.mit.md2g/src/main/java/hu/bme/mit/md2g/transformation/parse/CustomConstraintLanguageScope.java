package hu.bme.mit.md2g.transformation.parse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import hu.bme.mit.gamma.expression.language.scoping.ExpressionLanguageScopeProvider;


public class CustomConstraintLanguageScope extends ExpressionLanguageScopeProvider{
	
	@Override
	public IScope getScope(EObject context, EReference reference) {		
		return super.getScope(context, reference);
	}
	
	@Override
	protected IScope delegateGetScope(EObject context, EReference reference) {
		return super.delegateGetScope(context, reference);
	}
}