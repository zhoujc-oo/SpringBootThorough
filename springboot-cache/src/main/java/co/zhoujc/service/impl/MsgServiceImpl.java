package co.zhoujc.service.impl;

import co.zhoujc.dao.UserDao;
import co.zhoujc.domain.User;
import co.zhoujc.service.MsgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Service
public class MsgServiceImpl implements MsgService {

    private HashMap<String, String> cache = new HashMap<>();

    /**
     * 设置验证码
     * @param tele
     * @return
     */
    @Override
    public String get(String tele) {
        String code = tele.substring(tele.length() - 6);
        cache.put(tele, code);
        return code;
    }

    /**
     * 进行对比是否与tele相等
     * @param tele
     * @param code
     * @return
     */
    @Override
    public boolean check(String tele, String code) {
        String queryCode = cache.get(tele);
        return code.equals(queryCode);
    }
}
