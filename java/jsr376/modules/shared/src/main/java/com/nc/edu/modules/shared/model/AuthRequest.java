package com.nc.edu.modules.shared.model;

import java.util.Set;

public record AuthRequest(String user, String pass, Set<Scope> scopes) {

}
