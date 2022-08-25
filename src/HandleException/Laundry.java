/**

package HandleException;

public class Laundry {

    public void doLaundry() throws PantsException, LingerieException{
        //code

    }

    public void go(){
        Laundry laundry = new Laundry();
        try{
            laundry.doLaundry();
        } catch (PantsException pex){
            // recovery code
        } catch (LingerieException lex){
            // recovery code
        }
    }
}
**/