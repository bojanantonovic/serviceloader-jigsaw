import disneyworld.service.DisneyWorldMember;

module serviceconsumer {
	requires serviceinterface;

	requires serviceimplementations;

	uses DisneyWorldMember;
}