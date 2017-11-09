import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
#from subprocess import check_output
t20_data=pd.read_csv('matches001.csv', usecols=[0,1,4,5,6])
t20_Bang = t20_data.query('Team1 == ["K"] ').reset_index(drop='true')
t20_ipl = t20_Bang.query('Team2 == ["RC"] ').reset_index(drop='true')
t20_ipll = t20_ipl.query('Ground == ["MCS"]').reset_index(drop='true')
t20_iplll = t20_ipll.query('Peoplesprediction == ["K"]').reset_index(drop='true')
#print(t20_psl.describe())
labels = ['Team1', 'Team2']
sns.set(style="darkgrid")
ax = sns.countplot(x="winner", data=t20_iplll, palette="RdBu")
