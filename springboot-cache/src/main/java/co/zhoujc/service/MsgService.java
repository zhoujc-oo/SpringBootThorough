package co.zhoujc.service;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
public interface MsgService {

    public String get(String tele);

    public boolean check(String tele, String code);
}
