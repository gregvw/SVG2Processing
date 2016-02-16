import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.util.*; 
import java.nio.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.io.*;
import java.util.ArrayList;

class SVGParser {

// Get an array of strings for each SVG path object in the given file
static void extractPaths( File sourceFile, String encoding, ArrayList<String> allPaths ) {
  allPaths.clear();
  try {
    Document doc = Jsoup.parse(sourceFile, "UTF-8");
    Elements pathElements = doc.body().select("path");
    for(Element elem : pathElements) {
      allPaths.add(elem.toString());
    }
  }
  catch(IOException e) {
    System.out.println(e);   
  }
  
} // extractPaths

} // class SVGParser