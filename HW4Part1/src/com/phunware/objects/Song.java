package com.phunware.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Song
	 *
	 * Default Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Song constructor
	/************************************************/

	public Song() {
		Artist[] artists = new Artist[2];
		artists[0] = new Artist("Brian", "Storey");
		artists[1] = new Artist("Gabe", "Morales");
		mEnsemble = new Ensemble ("defaultEnsemble", artists);
		mTitle = "defaultTitle";
		mYearReleased = 1982;
	}

	/*
	 * Song
	 *
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Song constructor
	/************************************************/
	public Song(Ensemble ensemble, String title) {
		mEnsemble = ensemble;
		mTitle = title;
		mYearReleased = 0;
	}
	/*
	 * Song
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third Song constructor
	/************************************************/
	public Song(Ensemble ensemble, String title, int yearReleased) {
        mEnsemble = ensemble;
        mTitle = title;
        mYearReleased = yearReleased;
    }
}
