package uk.co.thomasc.steamkit.base.generated.steamlanguage;

import java.util.HashMap;

public enum EEconTradeResponse {
	Accepted(0),
	Declined(1),
    @Deprecated
	VacBannedInitiator(2),
    TradeBannedInitiator(2),
    @Deprecated // Use TradeBannedTarget
	VacBannedTarget(3),
    TradeBannedTarget(3),
	TargetAlreadyTrading(4),
	Disabled(5),
	NotLoggedIn(6),
	Cancel(7),
	TooSoon(8),
	TooSoonPenalty(9),
	ConnectionFailed(10),
    @Deprecated // Use AlreadyTrading
    InitiatorAlreadyTrading(11),
    AlreadyTrading(11),
    @Deprecated // Use AlreadyHasTradeRequest
	Error(12),
    AlreadyHasTradeRequest(12),
    @Deprecated // Use NoResponse
	Timeout(13),
    NoResponse(13),
    CyberCafeInitiator(14),
    CyberCafeTarget(15),
    SchoolLabInitiator(16),
    SchoolLabTarget(16),
    InitiatorBlockedTarget(18),
    InitiatorNeedsVerifiedEmail(20),
    InitiatorNeedsSteamGuard(21),
    TargetAccountCannotTrade(22),
    InitiatorSteamGuardDuration(23),
    // TODO: Figure out what this mysterious 25 is...
    Unknown(25),
    OKToDeliver(50);

	private int code;


	private EEconTradeResponse(int code) {
		this.code = code;
	}

	public int v() {
		return code;
	}

	private static HashMap<Integer, EEconTradeResponse> values = new HashMap<Integer, EEconTradeResponse>();

	static {
		for (final EEconTradeResponse type : EEconTradeResponse.values()) {
			EEconTradeResponse.values.put(type.v(), type);
		}
	}

	public static EEconTradeResponse f(int code) {
		return EEconTradeResponse.values.get(code);
	}
}
