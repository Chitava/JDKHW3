public class Calculator <T extends Number, U extends Number, S extends Number> {
    private T a;
    private T b;

    public <S> S sum (T a, U b){
        if (a instanceof Double || b instanceof Double){
            return (S) new Double (a.doubleValue() + b.doubleValue());
        }else return (S) new Integer(a.intValue()+b.intValue());

    }

    public <S> S minus (T a, U b){
        if (a instanceof Double || b instanceof Double){
            return (S) new Double (a.doubleValue() - b.doubleValue());
        }else return (S) new Integer(a.intValue() - b.intValue());

    }

    public <S> S mult (T a, U b){
        if (a instanceof Double || b instanceof Double){
            return (S) new Double (a.doubleValue() * b.doubleValue());
        }else return (S) new Integer(a.intValue() * b.intValue());

    }

    public <S> S div (T a, U b){
        if (a instanceof Double || b instanceof Double){
            return (S) new Double (a.doubleValue() / b.doubleValue());
        }else return (S) new Integer(a.intValue() / b.intValue());

    }

}



