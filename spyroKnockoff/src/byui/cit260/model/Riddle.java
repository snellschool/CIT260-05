/*
 * Snell, Dallin
 * 14 MAY 18
 * CIT260
 */
package byui.cit260.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Dallin
 */
public class Riddle implements Serializable {
    String answer;
    String hint;
    String riddle;
    
    /**
     * 
     */
    public Riddle() {
        
    }

    /**
     * 
     * @param answer
     * @param hint
     * @param riddle 
     */
    public Riddle(String answer, String hint, String riddle) {
        this.answer = answer;
        this.hint = hint;
        this.riddle = riddle;
    }

    /**
     * 
     * @return 
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 
     * @return 
     */
    public String getHint() {
        return hint;
    }

    /**
     * 
     * @return 
     */
    public String getRiddle() {
        return riddle;
    }

    /**
     * 
     * @param answer 
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * 
     * @param hint 
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * 
     * @param riddle 
     */
    public void setRiddle(String riddle) {
        this.riddle = riddle;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.answer);
        hash = 41 * hash + Objects.hashCode(this.hint);
        hash = 41 * hash + Objects.hashCode(this.riddle);
        return hash;
    }

    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Riddle other = (Riddle) obj;
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.hint, other.hint)) {
            return false;
        }
        if (!Objects.equals(this.riddle, other.riddle)) {
            return false;
        }
        return true;
    }
} // end of class
