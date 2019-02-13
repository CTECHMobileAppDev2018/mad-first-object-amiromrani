public class weapon  {
  
 private String type;
 private int damage;
  
 public void settype(String inputType) {
   if (inputType != "Gun" ) {
      this.type = "invalid";
      return;
   }
   this.type = "Gun";
   
 }
 
 
}