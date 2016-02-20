

void setup(){

  File input = new File("/Users/gvonwin/Processing/jsouptest/multipath.svg");
 
  ArrayList<String> allPaths = new ArrayList<String>();

  SVGParser svgParser = new SVGParser();
  PathDParser dParser = new PathDParser();
  
  // Collect all SVG paths from the given file
  svgParser.extractPaths(input, "UTF-8", allPaths );
  
  for(String path:allPaths) {
  
    SVGPath svgPath = new SVGPath(path); 
      ArrayList<PathDElement> elements = new ArrayList<PathDElement>();
       dParser.partition(svgPath.d,elements);
  }

}
