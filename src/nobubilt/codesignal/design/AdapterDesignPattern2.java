package nobubilt.codesignal.design;

public class AdapterDesignPattern2 {

	static class StandardVideoFormat {
        private int frameRate;
        private String resolution;
        private byte[] content;

        public StandardVideoFormat(int frameRate, String resolution, byte[] content) {
            this.frameRate = frameRate;
            this.resolution = resolution;
            this.content = content;
        }

        public byte[] getContent() {
            return content;
        }

        public void setContent(byte[] content) {
            this.content = content;
        }
    }

    // TODO: Implement AdvancedFilterProcessor with a method applyFilter that applies a filter to the video.
    // If the filterType is not valid, throw a RuntimeException with the message "Filter type not supported".
    static class AdvancedFilterProcessor {
        // To apply a filter for a video, you can use this kind of transformation:
        public StandardVideoFormat applyFilter(StandardVideoFormat video, String filterType)
        {
            switch(filterType)
            {
                case "grayscale": break;
                case "sepia": break;
                case "invert": break;
                default: throw new RuntimeException("Filter type not supported");
            }
             video.setContent((filterType + "_" + new String(video.getContent())).getBytes());        
             return video;    
        }

    }

    // TODO: Implement FilterAdapter class using AdvancedFilterProcessor instance for backward compatibility
    static class FilterAdapter {
        private AdvancedFilterProcessor advancedFilterProcessor;

        public FilterAdapter() {
            this.advancedFilterProcessor = new AdvancedFilterProcessor();
        }
        
        public StandardVideoFormat processVideo(StandardVideoFormat video) {
            return video;
        }

        public StandardVideoFormat processVideo(StandardVideoFormat video, String filterType) {
            // TODO: Implement this method
            try 
            {
            return advancedFilterProcessor.applyFilter(video, filterType);                
            }
            catch(RuntimeException ve)
            {
                return video;
            }

        }
    }
    
    /**
     * You are upgrading an existing video processing application to support a new feature: 
     * applying filters to videos. The current version of the application processes videos in
     *  a standard format (let's call it StandardVideoFormat) and includes capabilities such 
     *  as trimming and resizing videos. Your task is to introduce a new filter application 
     *  feature without modifying the existing video processing pipeline. This new feature should
     *   allow the application to apply a series of visual filters (e.g., grayscale, sepia, and
     *    invert colors) to videos.

To achieve backward compatibility and introduce this feature without disrupting the existing codebase, 
you decide to use the Adapter pattern. Your task is to:

Implement a new class, FilterAdapter, that will serve as an adapter between the existing video 
processing pipeline and the new filter application functionality.
The FilterAdapter should use AdvancedFilterProcessor, that you also need to implement. This class 
is responsible for applying filters to StandardVideoFormat videos.
The AdvancedFilterProcessor should have a method, applyFilter(video, filterType), where video is an 
instance of StandardVideoFormat and filterType is a string representing the type of filter to apply.
 The supported filter types are "grayscale", "sepia", and "invert". If the filterType is not valid, 
 throw a RuntimeException with the message "Filter type not supported".
The FilterAdapter should expose a method, processVideo(video, filterType), that internally uses the 
AdvancedFilterProcessor to apply the filter and returns the processed video.
Ensure that the FilterAdapter is compatible with the current video processing interface, which expects 
a method signature of processVideo(video).
     */
}
