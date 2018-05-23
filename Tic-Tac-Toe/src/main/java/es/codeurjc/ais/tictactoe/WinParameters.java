package es.codeurjc.ais.tictactoe;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WinParameters {

	@Parameters
	public static Collection<Object[]> winPositions() {

		Object [] [] winPositions = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
				{ 0, 4, 8 }, { 6, 4, 2 } };

		return Arrays.asList(winPositions);

	}

}