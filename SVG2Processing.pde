

void setup(){

  File input = new File("/Users/gvonwin/Processing/jsouptest/multipath.svg");
 
  ArrayList<String> allPaths = new ArrayList<String>();

  SVGParser parser = new SVGParser();
   
  // Collect all SVG paths from the given file
  parser.extractPaths(input, "UTF-8", allPaths );
  
  for(String path:allPaths) {
  
    SVGPath svgPath = new SVGPath(path); 
    System.out.println( svgPath.id + ", " + 
                        svgPath.d + ", " +
                        svgPath.fill + ", " + 
                        svgPath.strokeColor + ", " +
                        svgPath.strokeWidth);  

    }

}