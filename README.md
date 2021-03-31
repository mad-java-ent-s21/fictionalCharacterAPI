###Problem Statement
There seem to be various libraries and lists of fictional characters available however we found that libraries tend to be available with only specific themes such as superheroes. The available resources that we found that might be close to this all seem fractured in some way. There used to be a old database but that has since been shut down. There is a website that exists to search for fictional characters (whatcharacter.com) but while it has a footer link for API, the link doesn't appear to do anything nor is there documentation that supports an API. Additionally it is visually quite dated.

Our API would be a resource of all kinds of fictional characters whether book, movie, anime, video game and so on. The structure would look something like media(title((character(name(age, height, species, etc))).

The problem that this solves is anyone seeking to obtain information on fictional characters, they'll no longer need to surf around for one that is particular to their theme. This could be useful for fan sites of various generes like Star Trek movies, Marvel comics, or even just movies or a particular media.

Our API will allow GET requests to request this data but also allow crowd souring of information with POST requests so that others can contribute.

Additionally, this could even be expanded past just characters as a future enhancement. This could even include things like vehicles unique to that specific universe.