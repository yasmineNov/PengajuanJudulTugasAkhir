package Program;

/***********************************************************************
 * Module:  KeputusanDospem.java
 * Author:  yasmine
 * Purpose: Defines the Class KeputusanDospem
 ***********************************************************************/

import java.util.*;

/** @pdOid 0d512e64-d959-4bd1-a4e5-0fd42cd7ecaf */
public class KeputusanDospem {
   /** @pdOid b3bc1d1d-76ae-449b-a896-f9e47c0e05c2 */
   private int idKeputusanDospem;
   /** @pdOid 20905081-b638-4246-ad59-7bbf80ff996b */
   private java.lang.Boolean statusDospem;
     /** @pdOid e05fdae5-adca-4a70-b2cb-7ec38ed19cbf */
   private Date tglAccDosen;
   
   /** @pdRoleInfo migr=no name=Judul assc=judulAccDosen mult=1..1 side=A */
   public Judul putusanDosen;
   /** @pdRoleInfo migr=no name=Dospem assc=accDospem mult=1..1 side=A */
   public Dospem dospem;
   
   /** @param newIdKeputusanDospem
    * @pdOid ea195881-6b5a-48b1-b24b-73554fc7cb77 */
   public void setIdKeputusanDospem(int newIdKeputusanDospem) {
      idKeputusanDospem = newIdKeputusanDospem;
   }
   
   /** @param newStatusDospem
    * @pdOid 671b0685-7f52-42e4-8554-86a76ee904ba */
   public void setStatusDospem(java.lang.Boolean newStatusDospem) {
      statusDospem = newStatusDospem;
   }
   
   /** @pdOid 02a180cd-1eeb-4e33-847c-f209aa53427c */
   public int getIdKeputusanDospem() {
      return idKeputusanDospem;
   }
   
   /** @pdOid a29e1854-7bc9-4572-9787-3bbe2abea795 */
   public java.lang.Boolean getStatusDospem() {
      return statusDospem;
   }

}