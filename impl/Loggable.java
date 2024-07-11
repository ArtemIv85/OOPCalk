package impl;

import Model.CompleksNumber;

public interface Loggable {
    void LogMessage(String message);

    void log(CompleksNumber N1, CompleksNumber N2, String operator, CompleksNumber result);
}
