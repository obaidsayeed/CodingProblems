//Asked Microsoft.
//
//Using a read7() method that returns 7 characters from a file, implement readN(n)
// which reads n characters.
//
//For example, given a file with the content “Hello world”, three read7() returns “Hello w”,
// “orld” and then “”.

// Dry Run : https://docs.google.com/document/d/1acX22WB8bP__PPa3JWTs5MUJa42_emqaZQSDU5krx7E/edit
public class ImplementReadNFunctionUsingRead7Function_28_06_2022 {
    String file = "";
    int offset = 0;
    String buffer = "";
    public ImplementReadNFunctionUsingRead7Function_28_06_2022(String file){
        this.file = file;
        this.offset = 0;
        this.buffer = "";
    }

    public String read7(){
        int start = this.offset;
        int end = Math.min(this.offset + 7,this.file.length());
        this.offset = end;
        return this.file.substring(start,end);
    }

    public String readN(int n){
        if (n > this.file.length()){
            return file;
        }
        while (this.buffer.length() < n){
            String extra = this.read7();
            if (extra.length() == 0)break;
            this.buffer += extra;
        }
        String resultString = this.buffer.substring(0,n);
        this.buffer = this.buffer.substring(n);
        return resultString;
    }
}
