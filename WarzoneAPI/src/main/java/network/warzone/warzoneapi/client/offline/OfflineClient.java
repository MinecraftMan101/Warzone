package network.warzone.warzoneapi.client.offline;

import network.warzone.warzoneapi.client.TeamClient;
import network.warzone.warzoneapi.models.*;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by luke on 4/27/17.
 */
public class OfflineClient implements TeamClient {

    @Override
    public void heartbeat(Heartbeat heartbeat) {

    }

    @Override
    public UserProfile login(PlayerLogin playerLogin) {
        return new UserProfile(new ObjectId(), playerLogin.getName(), playerLogin.getName().toLowerCase(),
                playerLogin.getUuid(), new Date().getTime(), new Date().getTime(), Arrays.asList(playerLogin.getIp()), new ArrayList<>(), new ArrayList<>(),
                0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>());
    }

    @Override
    public MapLoadResponse loadmap(Map map) {
        return new MapLoadResponse(false, new ObjectId().toString());
    }

    @Override
    public void addKill(Death death) {

    }

    @Override
    public MatchInProgress loadMatch(MatchLoadRequest matchLoadRequest) {
        return new MatchInProgress(new ObjectId().toString(), matchLoadRequest.getMap());
    }

    @Override
    public void finishMatch(MatchFinishPacket matchFinishPacket) {

    }

    @Override
    public void destroyWool(DestroyWoolRequest destroyWoolRequest) {

    }

    @Override
    public RankList retrieveRanks() {
        return new RankList();
    }

    @Override
    public RankUpdateResponse updateRank(String player, RankUpdateRequest.Action action, RankUpdateRequest rankUpdateRequest){
        return null;
    };

    @Override
    public RankManageResponse manageRank(RankManageRequest.Action action, RankManageRequest rankManageRequest) {
        return null;
    }

    @Override
    public RankManageResponse editRank(RankEditRequest.EditableField field, RankEditRequest rankEditRequest) {
        return null;
    }

    @Override
    public RankManageResponse editPermissions(RankPermissionsUpdateRequest.Action action, RankPermissionsUpdateRequest permissionsUpdateRequest) {
        return null;
    }

    @Override
    public IssuePunishmentResponse issuePunishment(IssuePunishmentRequest issuePunishmentRequest) {
        return null;
    }

    @Override
    public PunishmentsListResponse getPunishments(PunishmentsListRequest punishmentsListRequest) {
        return null;
    }

    @Override
    public RevertPunishmentResponse revertPunishment(String id) {
        return null;
    }
}
