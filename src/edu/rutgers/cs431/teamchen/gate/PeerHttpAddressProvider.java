package edu.rutgers.cs431.teamchen.gate;

import java.net.URL;
import java.util.ArrayList;

// Provides addresses of all peers
public interface PeerHttpAddressProvider {
    ArrayList<URL> getPeerHttpAddresses();
}
