package Green;

import Grey.Hazard;

/*
 * @brief Public interface for HReporter
 * 
 * @note import hazard java file to call the Hazard object in seeDanger function
 */
public interface HReporter_IF {
    public void seeDanger(HReporter_IF r, Hazard h);
    public void setDirectOverseer(HReporter_IF r);
    public HReporter_IF getDirectOverseer();
}
