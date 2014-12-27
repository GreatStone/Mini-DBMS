package DBMS.execute;

import com.db.minidb.data.value.ValueBase;
import com.db.minidb.data.value.ValueBool;
import com.db.minidb.data.value.ValueDouble;
import com.db.minidb.data.value.ValueInt;
import com.db.minidb.data.value.ValueString;
import com.db.minidb.dict.type.TypeDataEnum;

public class Calculate {
	private Calculate(){}
	public static ValueBase add (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.INT){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueInt(TypeDataEnum.INT, (Integer)valA.getValue() + (Integer)valB.getValue());
			} else if (valB.getType() == TypeDataEnum.DOUBLE){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double) ((Integer)valA.getValue() + (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.DOUBLE){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double)valA.getValue() + (Integer)valB.getValue());
			} else if (valA.getType() == TypeDataEnum.DOUBLE){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double) ((Double)valA.getValue() + (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.STRING){
			if (valB.getType() == TypeDataEnum.STRING){
				return new ValueString(TypeDataEnum.STRING, (String)valA.getValue()+(String)valB.getValue());
			} else{
				throw new Exception("Error: Type not match.");
			}
		} else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase sub (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.INT){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueInt(TypeDataEnum.INT, (Integer)valA.getValue() - (Integer)valB.getValue());
			} else if (valB.getType() == TypeDataEnum.DOUBLE){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double) ((Integer)valA.getValue() - (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.DOUBLE){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double)valA.getValue() - (Integer)valB.getValue());
			} else if (valA.getType() == TypeDataEnum.DOUBLE){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double) ((Double)valA.getValue() - (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase mul (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.INT){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueInt(TypeDataEnum.INT, (Integer)valA.getValue() * (Integer)valB.getValue());
			} else if (valB.getType() == TypeDataEnum.DOUBLE){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double) ((Integer)valA.getValue() * (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.DOUBLE){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double)valA.getValue() * (Integer)valB.getValue());
			} else if (valA.getType() == TypeDataEnum.DOUBLE){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double) ((Double)valA.getValue() * (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase div (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.INT){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueInt(TypeDataEnum.INT, (Integer)valA.getValue() / (Integer)valB.getValue());
			} else if (valB.getType() == TypeDataEnum.DOUBLE){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double) ((Integer)valA.getValue() / (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.DOUBLE){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double)valA.getValue() / (Integer)valB.getValue());
			} else if (valA.getType() == TypeDataEnum.DOUBLE){
				return new ValueDouble(TypeDataEnum.DOUBLE, (Double) ((Double)valA.getValue() / (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase and (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.BOOLEAN){
			if (valB.getType() == TypeDataEnum.BOOLEAN){
				return new ValueBool(TypeDataEnum.BOOLEAN, (Boolean)valA.getValue()&(Boolean)valB.getValue());
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase or (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.BOOLEAN){
			if (valB.getType() == TypeDataEnum.BOOLEAN){
				return new ValueBool(TypeDataEnum.BOOLEAN, (Boolean)valA.getValue()|(Boolean)valB.getValue());
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase less (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.INT){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, (Integer)valA.getValue() < (Integer)valB.getValue());
			} else if (valB.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, ((Integer)valA.getValue() < (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.DOUBLE){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, (Double)valA.getValue() < (Integer)valB.getValue());
			} else if (valA.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, ((Double)valA.getValue() < (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase more (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.INT){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, (Integer)valA.getValue() > (Integer)valB.getValue());
			} else if (valB.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, ((Integer)valA.getValue() > (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.DOUBLE){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, (Double)valA.getValue() > (Integer)valB.getValue());
			} else if (valA.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, ((Double)valA.getValue() > (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase eql (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.INT){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, ((Integer)valA.getValue()).equals((Integer)valB.getValue()));
			} else if (valB.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, (new Double((Integer)valA.getValue()).equals((Double)valB.getValue())));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.DOUBLE){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, ((Double)valA.getValue()).equals(new Double((Integer)valB.getValue())));
			} else if (valA.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, ((Double)valA.getValue()).equals((Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		} else if (valA.getType() == TypeDataEnum.STRING){
			if (valB.getType() ==  TypeDataEnum.STRING){
				return new ValueBool(TypeDataEnum.STRING,((String)valA.getValue()).equals((String)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}
		else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase neql (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.INT){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, !((Integer)valA.getValue()).equals((Integer)valB.getValue()));
			} else if (valB.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, !(new Double((Integer)valA.getValue()).equals((Double)valB.getValue())));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.DOUBLE){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, !((Double)valA.getValue()).equals(new Double((Integer)valB.getValue())));
			} else if (valA.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, !((Double)valA.getValue()).equals((Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		} else if (valA.getType() == TypeDataEnum.STRING){
			if (valB.getType() ==  TypeDataEnum.STRING){
				return new ValueBool(TypeDataEnum.BOOLEAN, !((String)valA.getValue()).equals((String)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}
		else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase nless (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.INT){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, (Integer)valA.getValue() >= (Integer)valB.getValue());
			} else if (valB.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, (new Double((Integer)valA.getValue()) >= (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.DOUBLE){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, (Double)valA.getValue() >= new Double((Integer)valB.getValue()));
			} else if (valA.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, ((Double)valA.getValue() >= (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else{
			throw new Exception("Error: Type not match.");
		}
	}
	
	public static ValueBase nmore (ValueBase valA, ValueBase valB) throws Exception{
		if (valA.getType() == TypeDataEnum.INT){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, (Integer)valA.getValue() <= (Integer)valB.getValue());
			} else if (valB.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, (new Double((Integer)valA.getValue()) <= (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else if (valA.getType() == TypeDataEnum.DOUBLE){
			if (valB.getType() == TypeDataEnum.INT){
				return new ValueBool(TypeDataEnum.BOOLEAN, (Double)valA.getValue() <= new Double((Integer)valB.getValue()));
			} else if (valA.getType() == TypeDataEnum.DOUBLE){
				return new ValueBool(TypeDataEnum.BOOLEAN, ((Double)valA.getValue() <= (Double)valB.getValue()));
			} else{
				throw new Exception("Error: Type not match.");
			}
		}else{
			throw new Exception("Error: Type not match.");
		}
	}
}