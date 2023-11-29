import java.util.ArrayList;

public class VariableController {
    private ArrayList<Variable> contvar;

    public VariableController() {
        contvar = new ArrayList<Variable>();
    }
    
    public boolean add(Variable v){
        for(int i=0; i<contvar.size(); i++){
            if( (contvar.get(i).getName().equals(v.getName())))
                return false;
        }
        contvar.add(v);
        return true;
    }
    
    public Variable search(String name){
        for(int i=contvar.size()-1; i>=0; i--){
            if(contvar.get(i).getName().equals(name))
                return contvar.get(i);
        }
        return null;
    }
    
    public boolean exists(String name){
        if (contvar == null) {
            return false;
        }
        for (Variable element : contvar) {
            if (element != null && name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }
}