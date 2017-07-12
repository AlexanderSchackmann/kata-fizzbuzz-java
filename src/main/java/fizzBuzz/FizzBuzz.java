//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private TranslatorAggregator translatorAggregator;


	FizzBuzz() {
		List<Translator> translators = new ArrayList<Translator>();
		translators.add(new FooTranslator());
		translators.add(new FizzTranslator());
		translators.add(new BarTranslator());
		translators.add(new BuzzTranslator());
		translatorAggregator = new TranslatorAggregator(translators);

	}

	public String translate(int number) {
		return translatorAggregator.translate(number);
	}

	/*
	 * comments:
	 * 
	 * - checks verletzen single responsibility/ sind eigene Logik - open closed:
	 * if-else Konstrukt macht es schwer weitere F�lle zu erg�nzen - clean code w�re
	 * auch nicht schlecht - mit dem neuen Checker (enth�lt 3) kommt eine andere
	 * Logik hinzu -> check-Logiken separieren - dependency inversion: checks
	 * injecten - checks: gemeinsames interface, verschiedene Klassen - KERNFRAGE
	 * die bleibt: wer k�mmert sich um die Logik der Reihenfolge der checks
	 */
}