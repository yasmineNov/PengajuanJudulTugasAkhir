package Program;

/***********************************************************************
 * Module:  KeputusanProdi.java
 * Author:  yasmine
 * Purpose: Defines the Class KeputusanProdi
 ***********************************************************************/

import java.util.*;

/** @pdOid 350e12d0-28bc-4bb2-98b4-4e84a8cff0e6 */
public class KeputusanProdi {
   /** @pdOid df7d697a-8c03-447a-bb85-13a19e0ef8a7 */
   private int idKeputusanProdi;
   /** @pdOid 1175fdd5-6e99-4bd7-9f85-b32e294b099d */
   private java.lang.Boolean statusProdi;
   
   /** @pdRoleInfo migr=no name=Prodi assc=kepProdi mult=1..1 */
   public Prodi prodi;
   /** @pdRoleInfo migr=no name=Judul assc=putusanJudul mult=1..1 side=A */
   public Judul putusanJdl;
   
   /** @param newIdKeputusanProdi
    * @pdOid fb8c47e4-2a91-473c-a079-b261a63185f1 */
   public void setIdKeputusanProdi(int newIdKeputusanProdi) {
      idKeputusanProdi = newIdKeputusanProdi;
   }
   
   /** @param newStatusProdi
    * @pdOid ffee3cea-2245-4a4e-ab54-146d48c4bf3d */
   public void setStatusProdi(java.lang.Boolean newStatusProdi) {
      statusProdi = newStatusProdi;
   }
   
   /** @pdOid 1f00ef20-a2e5-4045-be0c-ae5c3cc3acb4 */
   public int getIdKeputusanProdi() {
      return idKeputusanProdi;
   }
   
   /** @pdOid a7f2a1ca-c890-4a16-bc0d-05e3ca0d08a6 */
   public java.lang.Boolean getStatusProdi() {
      return statusProdi;
   }

}