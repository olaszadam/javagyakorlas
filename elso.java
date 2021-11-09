/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elso;

/**
 *
 * @author 14SZFT
 */
public class elso {

    /**
     * @param args the command line arguments
     */
    /**public static void main(String[] args) {
        System.out.println(150 + 40 + "Hello!");
    }
    
    void Metodus(){
    
    }
    
    String Fuggveny(){
        return null;
    }*
    public static void main(String[] args) {
        String result = censor(" A barom nagyon aranyos barom","barom","***");
        System.out.println("Próba!" + result);
    }
    
    static String censor(String text, String toChange, String newWord){
        text = text.replaceAll(toChange, newWord);
        return text;
    }
    **/
    public static void main(String[] args) {
        Human first = new Human();
        first.writeMyName();
    }
    
}