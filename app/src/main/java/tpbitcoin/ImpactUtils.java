package tpbitcoin;

import java.math.BigInteger;

public class ImpactUtils {





    /**
     * computes the expected time (in seconds) for mining a block
     * @param hashrate: miner hashing capacity (hash/s)
     * @param difficultyAsInteger: block difficulty, as BigInteger (256 bits integer)
     * @return expected time in seconds before finding a correct block
     */
    // TODO
    public static long expectedMiningTime(long hashrate, BigInteger difficultyAsInteger){
        //return 2^32 * (difficultyAsInteger.longValue()/hashrate);
        /*String miningTime = new String((Math.pow(2, 32) * (difficultyAsInteger.longValue()/hashrate)) + "");
        int indexOfE = miningTime.indexOf('E');
        miningTime = miningTime.substring(0, indexOfE);
        miningTime = miningTime.replace(".", "");
        return Long.parseLong(miningTime);*/
        Double proba = (Double.parseDouble(difficultyAsInteger + "") / Math.pow(2, 256));
        System.out.println(proba);
        return proba.longValue() * hashrate;
    }

    /**
     * Compute the total hashrate of the network given current difficulty level
     * @param difficultyAsInteger: difficulty level as 256bits integer
     * @return hashrate of the network in GH/s
     */
    // TODO
    public static long  globalHashRate(BigInteger difficultyAsInteger){
        return 1L;
    }

    /**
     * Compute the total energy consumption of the network
     * assuming each miner has the same hashrate, and consume the same power
     * @param minerHashrate: the hashrate of each miner, in GH/s
     * @param minerPower: the power consumption of each miner, in Watts
     * @param networkHashrate : the global hashrate of the network
     * @param duration : in second
     * @return energy consumed during duration, in kWh
     */
    // TODO
    public static long globalEnergyConsumption(long minerHashrate, long minerPower, long networkHashrate, long duration){
        return 1L;
    }





}
