package Program;

/***********************************************************************
 * Module:  User.java
 * Author:  yasmine
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.util.*;

/** @pdOid 71991572-02f2-4346-ba2f-8868d6c15fda */
public class User {
   /** @pdOid f8306ad0-55c0-417c-b9e4-42f20a11ca16 */
   private String nama;
   /** @pdOid f18b6a7f-12c5-46b5-87a3-a95af9662cdc */
   private String nik;
   /** @pdOid 169a9169-310f-4400-befe-f200b331fab0 */
   private String jenisKelamin;
   /** @pdOid fe94575a-171d-40b5-9688-99703601835d */
   private String tanggalLahir;
   /** @pdOid 0b4649b3-74a2-45aa-bfaf-6ebb22e655a2 */
   private String alamat;
   /** @pdOid b5d8c77a-72ac-4b70-8ed4-8ef13024d5ac */
   private String noTelp;
   /** @pdOid a5024fff-8b57-45d7-ab21-b86dac482603 */
   private String email;
   /** @pdOid 14f8cdb1-d900-47f1-8ec6-4254d02eb6b1 */
   private String agama;
   
   /** @pdOid 8c544265-5ef5-40f9-9cb7-13835f55c3dd */
   public User() {
      // TODO: implement
   }
   
   /** @pdOid fb86b414-0374-40fc-a4ac-020fc2330cd3 */
   public String getNama() {
      return nama;
   }
   
   /** @param newNama
    * @pdOid bac8ebf3-3171-4f2d-9723-40d8590434ec */
   public void setNama(String newNama) {
      nama = newNama;
   }
   
   /** @pdOid 9b3f5351-de0b-49f7-987e-fce5a881b4ba */
   public String getNik() {
      return nik;
   }
   
   /** @param newNik
    * @pdOid f99243e7-3cd7-4a74-a1de-0097a76b7515 */
   public void setNik(String newNik) {
      nik = newNik;
   }
   
   /** @pdOid 4f6da63b-9ff3-4606-b19a-5ca1ff96af7e */
   public String getJenisKelamin() {
      return jenisKelamin;
   }
   
   /** @param newJenisKelamin
    * @pdOid 3c22175f-dae6-427e-906d-42e8d58f0145 */
   public void setJenisKelamin(String newJenisKelamin) {
      jenisKelamin = newJenisKelamin;
   }
   
   /** @pdOid 68db184f-e3a2-478c-a4dc-51cc46ec91b8 */
   public String getTanggalLahir() {
      return tanggalLahir;
   }
   
   /** @param newTanggalLahir
    * @pdOid 050e0d97-95fa-410f-a6b2-19ef44c40cf7 */
   public void setTanggalLahir(String newTanggalLahir) {
      tanggalLahir = newTanggalLahir;
   }
   
   /** @pdOid 894f7acc-b57f-416e-9c8a-cdf76a60f87c */
   public String getAlamat() {
      return alamat;
   }
   
   /** @param newAlamat
    * @pdOid a9fa98c1-5856-465b-aa54-3e6d24e63266 */
   public void setAlamat(String newAlamat) {
      alamat = newAlamat;
   }
   
   /** @pdOid 32f548e2-b4ff-4d0c-b483-6f58ea4c69ed */
   public String getNoTelp() {
      return noTelp;
   }
   
   /** @param newNoTelp
    * @pdOid 77dabac3-aea2-4656-a321-ed89935cdb3f */
   public void setNoTelp(String newNoTelp) {
      noTelp = newNoTelp;
   }
   
   /** @pdOid 16cb54dc-9bc7-4bf9-997d-ac05ef919ee4 */
   public String getEmail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid 029d11f8-ea31-400a-af29-258381dbce0f */
   public void setEmail(String newEmail) {
      email = newEmail;
   }
   
   /** @pdOid 16fd19a6-0583-4479-974d-2380f5051060 */
   public String getAgama() {
      return agama;
   }
   
   /** @param newAgama
    * @pdOid ca3a2241-3aad-4b73-9e2f-f3eec52f7d04 */
   public void setAgama(String newAgama) {
      agama = newAgama;
   }

}