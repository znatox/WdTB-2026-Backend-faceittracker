package pl.wsb.faceittracker.tracker.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PlayerSocials {
    private String discordTag;
    private String twitchUrl;

    public PlayerSocials() {}
}