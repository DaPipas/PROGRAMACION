
package t7p1e1;

import Vista.Vista;

public class T7P1E1 {
    private static Vista v1;
    public static void main(String[] args) {
        v1 = new Vista();
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
        
    }
    public static void salir(){
        System.exit(0);
    }
}
