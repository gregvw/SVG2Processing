

void setup(){

  File input = new File("/Users/gvonwin/Processing/jsouptest/multipath.svg");
 
  ArrayList<String> allPaths = new ArrayList<String>();

  SVGParser svgParser = new SVGParser();
  PathDParser dParser = new PathDParser();
  
  // Collect all SVG paths from the given file
  svgParser.extractPaths(input, "UTF-8", allPaths );
  
  for(String path:allPaths) {
  
    SVGPath svgPath = new SVGPath(path); 
//    System.out.println( svgPath.id + ", " + 
//                        svgPath.d + ", " +
//                        svgPath.fill + ", " + 
//                        svgPath.strokeColor + ", " +
//                       svgPath.strokeWidth);  
//
//       System.out.println(svgPath.d); 
       ArrayList<PathDElement> elements = new ArrayList<PathDElement>();
       dParser.partition(svgPath.d,elements);
  }

}