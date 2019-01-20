import disneyworld.implementation.Donald;
import disneyworld.implementation.Goofy;
import disneyworld.implementation.Mickey;
import disneyworld.service.DisneyWorldMember;

module disneyservices {
	exports disneyworld.service;

	provides DisneyWorldMember with Mickey, Donald, Goofy;
}