package Mood.Analyser;

public class MoodAnalyserException extends Exception {
	enum ExceptionType{
		ENTERED_EMPTY, ENTERED_NULL
	}
	
	ExceptionType type;
	
	public MoodAnalyserException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
