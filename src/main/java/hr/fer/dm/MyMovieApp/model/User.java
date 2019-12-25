package hr.fer.dm.MyMovieApp.model;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private String id;
	private String name;
	private String birthday;
	private String email;
	private String profilePicture;
	private FBMovies movies;
	private FBFriends friends;
	private List<String> watched_movie_ids; 
	private List<String> watch_list_movie_ids; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public FBMovies getMovies() {
		return movies;
	}

	public void setMovies(FBMovies movies) {
		this.movies = movies;
	}

	public FBFriends getFriends() {
		return friends;
	}

	public void setFriends(FBFriends friends) {
		this.friends = friends;
	}

	public List<String> getWatched_movie_ids() {
		return watched_movie_ids;
	}

	public void setWatched_movie_ids(List<String> watched_movie_ids) {
		this.watched_movie_ids = watched_movie_ids;
	}

	public List<String> getWatch_list_movie_ids() {
		return watch_list_movie_ids;
	}

	public void setWatch_list_movie_ids(List<String> watch_list_movie_ids) {
		this.watch_list_movie_ids = watch_list_movie_ids;
	}

}
