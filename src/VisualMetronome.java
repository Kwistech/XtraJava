// Display count numbers in console.
class VisualMetronome {
    public static void main(String args[]) {
        int count, start, limit, bpm, ms;
        
        start = 1;
        count = start;
        limit = 4;
        
        bpm = 120;
        
        ms = 60_000 / bpm;
        
        while(count <= limit) {
            System.out.println(count);
            count ++;
            
            if(count > limit) count = start;
            
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
