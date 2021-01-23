/*
 *  SourceCodeFile.java
 * 
 *  Date created:       January 22, 2021
 *  Date last edited:   January 22, 2021
 * 
 * Authors:
 *      Logan Drescher  
 */

import java.io.File;
import java.net.URI;

 /**
  * A file that defines and describes the actions of a program in non-executable form.
  */
public abstract class SourceCodeFile extends File {

    public SourceCodeFile(File parent, String child){
        super(parent, child);
        this.validateConstruction();
    }

    public SourceCodeFile(String pathname){
        super(pathname);
        this.validateConstruction();
    }

    public SourceCodeFile(String parent, String child){
        super(parent, child);
        this.validateConstruction();
    }

    public SourceCodeFile(URI uri){
        super(uri);
        this.validateConstruction();
    }

    private void validateConstruction(){
        if (this.isDirectory()) throw new IllegalFileTypeException("File can not be a directory.");
    }
}
