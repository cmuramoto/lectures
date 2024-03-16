module com.nc.edu.modules.lib {
	requires transitive com.fasterxml.jackson.annotation;
	requires transitive com.fasterxml.jackson.core;
	requires transitive com.fasterxml.jackson.databind;

	exports com.nc.edu.modules.lib.json;
}