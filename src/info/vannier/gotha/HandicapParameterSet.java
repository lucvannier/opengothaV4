/*
 * HandicapParameterSet.java
 *
 */

package info.vannier.gotha;

/**
 *
 * @author Luc Vannier
 */
public class HandicapParameterSet implements java.io.Serializable{

//    private boolean hdBasedOnMMS = true;    // Obsolete from 3.52.04
    static final int HD_BASED_ON_RANK = 0;
    static final int HD_BASED_ON_MMS  = 1;
    static final int HD_BASED_ON_BZS  = 2;
    private int hdBase = HD_BASED_ON_MMS;
    
    /**
     * When one player in the game has a rank of at least hdNoHdRankThreshold,
     * then the game will be without handicap
     */
    private int hdNoHdRankThreshold = 0;
    
    /**
     * Handicap will be decreased by hdCorrection
     * Possible values are 0, 1, 2 or 3. Or -1
     */
    private int hdCorrection = 1;
    
    /**
     * Handicap Ceiling
     * Possible values are between 0 and 9;
     */
    private int hdCeiling;
    
    /** 
     * Creates a new instance of HandicapParameterSet 
     */
    public HandicapParameterSet() {
    }    

    /** 
     * Creates a new instance of HandicapParameterSet, clone of hps 
     */
    public HandicapParameterSet(HandicapParameterSet hps) {
//        this.hdBasedOnMMS = hps.isHdBasedOnMMS();
        this.hdBase = hps.getHdBase();
        this.hdNoHdRankThreshold = hps.getHdNoHdRankThreshold();
        this.hdCorrection = hps.getHdCorrection();
        this.hdCeiling = hps.getHdCeiling();
    }
    
    public void initForMM(){
//        hdBasedOnMMS = true;        // Obsolete from 3.52.04
        hdBase = HD_BASED_ON_MMS;
        hdNoHdRankThreshold = 0;
        hdCorrection = 1;       
        hdCeiling = 9;
    }
    
    public void initForSwiss(){
//        hdBasedOnMMS = false;        // Obsolete from 3.52.04
        hdBase = HD_BASED_ON_RANK;
        hdNoHdRankThreshold = -30;
        hdCorrection = 0;       
        hdCeiling = 0;
    }
    
    public void initForSwissCat(){
//        hdBasedOnMMS = true;        // Obsolete from 3.52.04
        hdBase = HD_BASED_ON_MMS;
        hdNoHdRankThreshold = 8;
        hdCorrection = 1;       
        hdCeiling = 9;
    }
        
    public void initForCup(){
//        hdBasedOnMMS = false;        // Obsolete from 3.52.04        
        hdBase = HD_BASED_ON_RANK;
        hdNoHdRankThreshold = -30;
        hdCorrection = 0;       
        hdCeiling = 0;
    }
    
    public void initForBreizh(){     
        hdBase = HD_BASED_ON_BZS;
        hdNoHdRankThreshold = -30;
        hdCorrection = 0;       
        hdCeiling = 0;
    }

    
//    public boolean isHdBasedOnMMS() {
//        return hdBasedOnMMS;
//    }
//
//    public void setHdBasedOnMMS(boolean hdBasedOnMMS) {
//        this.hdBasedOnMMS = hdBasedOnMMS;
//    }
/**
     * @return the hdBase
     */
    public int getHdBase() {
        return hdBase;
    }

    /**
     * @param hdBase the hdBase to set
     */
    public void setHdBase(int hdBase) {
        this.hdBase = hdBase;
    }
    
    public int getHdNoHdRankThreshold() {
        return hdNoHdRankThreshold;
    }

    public void setHdNoHdRankThreshold(int hdNoHdRankThreshold) {
        this.hdNoHdRankThreshold = hdNoHdRankThreshold;
    }

    public int getHdCorrection() {
        return hdCorrection;
    }

    public void setHdCorrection(int hdCorrection) {
        this.hdCorrection = hdCorrection;
    }

    public int getHdCeiling() {
        return hdCeiling;
    }

    public void setHdCeiling(int hdCeiling) {
        this.hdCeiling = hdCeiling;
    }
    
}
