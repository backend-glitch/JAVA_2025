
void main(){

// write a file
 try(FileWriter writer = new FileWriter("test.exe")){
    writer.write("i lke pizza");
      System.out.println("success");
 }catch(IOException e){
 System.out.println("could not write file." + "error : " + e);
 System.out.println("failed");
 }finally{
    System.out.println("done..");
 }

 // read a file
 String filer = "text.exe";
 try (BufferedReader reader = new BufferedReader(new FileReader(filer))){

    String line;
    while((line = reader.readLine()) != null){
System.out.println(line);
    }

System.out.println("success");
} catch(IOException e){
   System.out.println("could not find the file");
}
}