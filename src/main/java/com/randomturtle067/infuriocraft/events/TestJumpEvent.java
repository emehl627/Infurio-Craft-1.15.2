package com.randomturtle067.infuriocraft.events;


import javax.sound.midi.SoundbankResource;

import com.randomturtle067.infuriocraft.InfurioCraft;

import io.netty.handler.codec.http2.Http2FrameLogger.Direction;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.client.audio.Sound;
import net.minecraft.client.audio.SoundEventAccessor;
import net.minecraft.client.audio.SoundSource;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.GetCollisionBoxesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = InfurioCraft.MOD_ID, bus = Bus.FORGE)
public class TestJumpEvent 
{
	@SubscribeEvent
	public static void testJumpEvent(PlayerEvent event)
	{
		PlayerEntity Player = event.getPlayer();
		World world = Player.getEntityWorld();
		if (Player.collided)
		{
			Player.playSound(SoundEvents.ENTITY_TNT_PRIMED, 1, 10);
		}
	}
}
