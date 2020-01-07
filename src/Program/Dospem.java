package Program;

/***********************************************************************
 * Module:  Dospem.java
 * Author:  yasmine
 * Purpose: Defines the Class Dospem
 ***********************************************************************/

import java.util.*;

/** @pdOid 8d85be8a-dbe3-464e-8d75-f7acca0d7551 */
public class Dospem extends User {
   /** @pdOid fd2d5151-baf3-4daf-a627-9d78e6bf83f4 */
   private String npp;
   
   /** @param newNpp
    * @pdOid e65efa28-7ea0-4fb5-959b-537b289c9325 */
   public void setNpp(String newNpp) {
      npp = newNpp;
   }
   
   /** @pdOid c1eacb4c-62a4-40cb-8e26-2daa01f32c38 */
   public String getNpp() {
      return npp;
   }

}