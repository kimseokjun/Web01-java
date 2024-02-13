package j11_상속.piano;

public class MusicMain {
	public static void main(String[] args) {
			
		Piano piano = new Piano(5);
		NewPiano newPiano = new NewPiano(5);
		NewViolin newViolin = new NewViolin(5);
		Instrument instrument = new Instrument(2);
		
		
		piano.piano();
		piano.soccer();
		System.out.println();
		newPiano.piano();
		newPiano.baseball();
		System.out.println();
		newViolin.piano();
	}
}
