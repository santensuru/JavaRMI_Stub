package imagermi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.*;

/**
 *
 * @author AdminMobility
 */
public interface ImageInterface extends Remote {
    public int[] toBW(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize) throws RemoteException;
}
