package easycriteria.meta;

import easycriteria.where.EqualsIgnoreCaseCondition;
import easycriteria.where.LikeCondition;
import easycriteria.where.WhereCondition;

public class StringPropertyAttribute<X, T> extends PropertyAttribute<X, T>{

	public StringPropertyAttribute(String attribute, Class<T> entityType) {
		super(attribute, entityType);
	}

	public StringPropertyAttribute(String attribute, EntityPathNode parentPath, Class<T> entityType) {
		super(attribute, parentPath, entityType);
	}
	
	public WhereCondition eqIgnoreCase(String value) {
		return new EqualsIgnoreCaseCondition(getAttribute(), value, getParent());
	}
	
	public WhereCondition like(String value) {
		return new LikeCondition<T>(getAttribute(), value, null, getParent());
	}

}
