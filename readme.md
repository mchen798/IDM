
OS: Ubuntu Server 18.04 LTS (HVM), SSD Volume Type (Select as default from AWS)
Python >= 3.6.9

To build the environment need run the install_vppbs.sh. 
(It will install golang1.5, go-ethereum and swarm.)
'''
sudo ./install_vppbs.sh
'''
To init and run the blockchain:
./run_bc_init.sh
   -For mining:
   '''
    miner.start(1)
   '''
   -To stop the minig:
   '''
    miner.stop()
   '''
   -To check the Balanceo of accounts[0]
   '''
    eth.getBalance(eth.accounts[0])
   '''
    (More operation of geth, please check the link:https://geth.ethereum.org/docs/)


Open a new command window.
If the dirctory vppbs don't exist the python files, please run the cp_cmd.sh.
'''
cd ./vppbs
'''
To create a blockchain account:
'''
python3 newAC.py
'''
To list the blockchain exist accounts:
'''
python3 listAc.py
'''
To init and run the swarm(Create a blockchain account is necessary.):
'''
python3 setup_swarm.py 0
'''

Open a new command window.
'''
cd ./vppbs
'''
To upload model file(e.g. subcnn.pt, it will return a file hash) to swarm network:
'''
./upload.sh subcnn.pt
'''
To make a blockchain transaction(e.g. from accounts[0] to accounts[1]):
'''
python3 sendTrans.py 0 1
'''
Once the transaction is successful go to the blockchain, every node in this blockchain network could check the transaction.(e.g. by command )
(If your accounts[0] Insufficient Balance, please make mining command for several mins.)
To Download the model file from swarm network(You need know the upload file hash by check the transaction data tag):
'''
./download.sh d_subcnn.pt a95bc29aaaf562bc5147f08f8fbbea666098985afc44e1284bd9cf236b091ab6
'''
