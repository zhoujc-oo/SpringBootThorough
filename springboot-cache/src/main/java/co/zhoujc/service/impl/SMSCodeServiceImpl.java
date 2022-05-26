package co.zhoujc.service.impl;

import co.zhoujc.domain.SMSCode;
import co.zhoujc.service.SMSCodeService;
import co.zhoujc.utils.CodeUtils;
import net.rubyeye.xmemcached.MemcachedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 实现缓存验证码tele生成，与对比验证码
 * @Author zhoujc
 * @Date 2022/2/26
 */
@Service
public class SMSCodeServiceImpl implements SMSCodeService {


    @Autowired
    private CodeUtils codeUtils;

//    @Override
///**
// *
// *   @Cacheable(value = "smsCode",key = "#tele")
// */
//    @CachePut(value = "smsCode",key = "#tele")
//    public String sendCodeToSMS(String tele) {
//        String code = codeUtils.generator(tele);
//        return code;
//    }
//
//    @Override
//    public boolean checkCode(SMSCode smscode) {
//        //取出内存中的验证码与传递过来的验证码对比，如果相同，返回true
//        String code = smscode.getCode();
//        String cacheCode = codeUtils.get(smscode.getTele());
//        return code.equals(cacheCode);
//    }


/**
 *  下面是springboot使用smemcached使用缓存
 */

    @Autowired
    private MemcachedClient memcachedClient;

    /**
     * 设置tele
     * @param tele
     * @return
     */
    @Override
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        try{
            memcachedClient.set(tele,10,code);
        }catch (Exception e){
            e.printStackTrace();
        }
        return code;
    }

    /**
     * 验证tele
     * @param smscode
     * @return
     */
    @Override
    public boolean checkCode(SMSCode smscode) {
        String code = null;
        try{
            code = memcachedClient.get(smscode.getTele()).toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return smscode.getCode().equals(code);
    }

}
