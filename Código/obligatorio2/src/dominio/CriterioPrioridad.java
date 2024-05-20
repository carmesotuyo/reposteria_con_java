//Carmela Sotuyo - 186554
//Fernando Spillere - 274924
package dominio;

import java.util.*;

public class CriterioPrioridad implements Comparator<Categoria>{
    @Override
    public int compare(Categoria c1, Categoria c2){
        return c1.getPrioridad()-c2.getPrioridad();
    }
}
